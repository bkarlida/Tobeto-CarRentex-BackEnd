package com.Tobeto.RentaCar.service.abstracts;

import com.Tobeto.RentaCar.service.dto.request.Brand.AddBrandRequest;
import com.Tobeto.RentaCar.service.dto.request.Brand.UpdateBrandRequest;
import com.Tobeto.RentaCar.service.dto.response.Brand.GetBrandListResponse;
import com.Tobeto.RentaCar.service.dto.response.Brand.GetBrandResponse;

import java.util.List;

public interface BrandService {
    void create (AddBrandRequest addBrandRequest);
    GetBrandResponse getById(int id);
    List<GetBrandListResponse> getAll();
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}
