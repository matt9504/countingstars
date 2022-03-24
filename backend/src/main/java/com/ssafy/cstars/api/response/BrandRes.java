package com.ssafy.cstars.api.response;

import com.ssafy.cstars.domain.entity.Brand;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@ApiModel("BrandResponse")
public class BrandRes {


    @ApiModelProperty(name = "Brand id")
    Long brandId;

    @ApiModelProperty(name = "Brand name")
    String name;

    @ApiModelProperty(name = "Brand endDate")
    Date endDate;

    @ApiModelProperty(name = "Brand brandAdmin")
    List<String> brandAdmin;

    public static BrandRes of(Brand brand, List<String> adminEmail){
        BrandRes res = new BrandRes();

        res.setBrandId(brand.getId());
        res.setName(brand.getName());
        res.setEndDate(brand.getEndDate());
        res.setBrandAdmin(adminEmail);
        return res;
    }


}
