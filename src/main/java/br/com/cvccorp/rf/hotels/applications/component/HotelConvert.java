package br.com.cvccorp.rf.hotels.applications.component;

import br.com.cvccorp.rf.hotels.domain.dto.HotelDTO;
import br.com.cvccorp.rf.hotels.domain.entities.Hotel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelConvert {

    public List<HotelDTO> convertToDTO(List<Hotel> hotels) {
        List<HotelDTO> hotelsDTO = new ArrayList<>();
        for (Hotel hotel : hotels) {
            HotelDTO hotelDTO = new HotelDTO();
            hotelDTO.setId(hotel.getId());
            hotelDTO.setName(hotel.getName());
            hotelDTO.setStatus(hotel.getStatus());
            hotelDTO.setStreet(hotel.getStreet());
            hotelDTO.setDistrict(hotel.getDistrict());
            hotelDTO.setNumber(hotel.getNumber());
            hotelDTO.setCity(hotel.getCity());
            hotelDTO.setState(hotel.getState());
            hotelDTO.setCountry(hotel.getCountry());
            hotelDTO.setRating(hotel.getRating());
            hotelDTO.setDescription(hotel.getDescription());
            hotelDTO.setAverageDaily(hotel.getAverageDaily());
            hotelsDTO.add(hotelDTO);
        }
        return hotelsDTO;
    }

    public Hotel convertToHotel(HotelDTO hotelDTO){
        Hotel hotel = new Hotel();
        hotel.setName(hotelDTO.getName());
        hotel.setStatus(hotelDTO.getStatus());
        hotel.setStreet(hotelDTO.getStreet());
        hotel.setDistrict(hotelDTO.getDistrict());
        hotel.setNumber(hotelDTO.getNumber());
        hotel.setCity(hotelDTO.getCity());
        hotel.setState(hotelDTO.getState());
        hotel.setCountry(hotelDTO.getCountry());
        hotel.setRating(hotelDTO.getRating());
        hotel.setDescription(hotelDTO.getDescription());
        hotel.setAverageDaily(hotelDTO.getAverageDaily());

        return hotel;

    }
}

