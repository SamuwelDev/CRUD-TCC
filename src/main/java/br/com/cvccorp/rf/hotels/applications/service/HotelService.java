package br.com.cvccorp.rf.hotels.applications.service;

import br.com.cvccorp.rf.hotels.applications.component.HotelConvert;
import br.com.cvccorp.rf.hotels.domain.repository.HotelRepository;
import br.com.cvccorp.rf.hotels.domain.dto.HotelDTO;
import br.com.cvccorp.rf.hotels.domain.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;
    private final HotelConvert hotelConvert;

    public HotelService(HotelRepository hotelRepository, HotelConvert hotelConvert) {
        this.hotelRepository = hotelRepository;
        this.hotelConvert = hotelConvert;
    }

    public List<HotelDTO> findAll(){
            List<Hotel> hotels = (List<Hotel>) hotelRepository.findAll();
            return hotelConvert.convertToDTO(hotels);
        //List<HotelDTO> listHotelDTO = hotelConvert.convertToDTO(hotels);
        //return listHotelDTO;
    }

    public void save(HotelDTO  hotelDTO) {
        Hotel hotel = hotelConvert.convertToHotel(hotelDTO);
        hotelRepository.save(hotel);
    }
}
