package br.com.cvccorp.rf.hotels.interfaces.rest.transform;

import br.com.cvccorp.rf.hotels.domain.dto.HotelDTO;
import br.com.cvccorp.rf.hotels.interfaces.rest.dto.HotelRQ;
import org.springframework.stereotype.Component;

@Component
public class HotelRQConvert {

        public HotelDTO convert(HotelRQ hotelRQ){

            HotelDTO hotelDTO = new HotelDTO();
            hotelDTO.setName(hotelRQ.getName());
            hotelDTO.setStatus(hotelRQ.getStatus());
            hotelDTO.setStreet(hotelRQ.getStreet());
            hotelDTO.setDistrict(hotelRQ.getDistrict());
            hotelDTO.setNumber(hotelRQ.getNumber());
            hotelDTO.setCity(hotelRQ.getCity());
            hotelDTO.setState(hotelRQ.getState());
            hotelDTO.setCountry(hotelRQ.getCountry());
            hotelDTO.setRating(hotelRQ.getRating());
            hotelDTO.setDescription(hotelRQ.getDescription());
            hotelDTO.setAverageDaily(hotelRQ.getAverageDaily());
            return hotelDTO;
    }
}

