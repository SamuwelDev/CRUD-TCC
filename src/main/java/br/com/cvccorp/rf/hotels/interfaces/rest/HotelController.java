package br.com.cvccorp.rf.hotels.interfaces.rest;

import br.com.cvccorp.rf.hotels.applications.service.HotelService;
import br.com.cvccorp.rf.hotels.domain.dto.HotelDTO;
import br.com.cvccorp.rf.hotels.interfaces.rest.dto.HotelRQ;
import br.com.cvccorp.rf.hotels.interfaces.rest.dto.HotelRS;
import br.com.cvccorp.rf.hotels.interfaces.rest.transform.HotelRQConvert;
import br.com.cvccorp.rf.hotels.interfaces.rest.transform.HotelRSConvert;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController{

    private final HotelService hotelService;
    private final HotelRSConvert hotelRSConvert;
    private final HotelRQConvert hotelRQConvert;

    public HotelController (HotelService hotelService,
                            HotelRSConvert hotelRSConvert,
                            HotelRQConvert hotelRQConvert){
       this.hotelService = hotelService;
       this.hotelRSConvert = hotelRSConvert;
       this.hotelRQConvert = hotelRQConvert;
    }

    @GetMapping(value = "/hotels", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HotelRS> getHotel() {
        List<HotelDTO> hotelsDTO = hotelService.findAll();
        return hotelRSConvert.convert(hotelsDTO);
        //List<HotelRS> listHotelRS =  hotelRSConvert.convert(hotelsDTO);
        //return listHotelRS;
    }

    @PostMapping(value = "/hotels")
    public void addHotel(@RequestBody HotelRQ hotelRQ) {
       HotelDTO hotelDTO = hotelRQConvert.convert(hotelRQ);
        hotelService.save(hotelDTO);
    }
}

