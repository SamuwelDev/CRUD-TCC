package br.com.cvccorp.rf.hotels.interfaces.rest.transform;

import br.com.cvccorp.rf.hotels.domain.dto.HotelDTO;
import br.com.cvccorp.rf.hotels.interfaces.rest.dto.HotelRS;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelRSConvert {

    public List<HotelRS> convert(List<HotelDTO> hotelsRS) {
        List<HotelRS> listHotelsRS = new ArrayList<>();
        for (HotelDTO hotelDTO : hotelsRS) {
            HotelRS hotelRS = new HotelRS();
            hotelRS.setId(hotelDTO.getId());
            hotelRS.setName(hotelDTO.getName());
            hotelRS.setStatus(hotelDTO.getStatus());
            hotelRS.setStreet(hotelDTO.getStreet());
            hotelRS.setDistrict(hotelDTO.getDistrict());
            hotelRS.setNumber(hotelDTO.getNumber());
            hotelRS.setCity(hotelDTO.getCity());
            hotelRS.setState(hotelDTO.getState());
            hotelRS.setCountry(hotelDTO.getCountry());
            hotelRS.setRating(hotelDTO.getRating());
            hotelRS.setDescription(hotelDTO.getDescription());
            hotelRS.setAverageDaily(hotelDTO.getAverageDaily());
            listHotelsRS.add(hotelRS);
        }
        return listHotelsRS;
    }

}
