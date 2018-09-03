package cn.mtianyan.service.address;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.mtianyan.ApplicationTests;
import cn.mtianyan.service.ServiceResult;
import cn.mtianyan.service.house.IAddressService;
import cn.mtianyan.service.search.BaiduMapLocation;

/**
 * Created by 瓦力.
 */
public class AddressServiceTests extends ApplicationTests {
    @Autowired
    private IAddressService addressService;

    @Test
    public void testGetMapLocation() {
        String city = "北京";
        String address = "北京市昌平区巩华家园1号楼2单元";
        ServiceResult<BaiduMapLocation> serviceResult = addressService.getBaiduMapLocation(city, address);

        Assert.assertTrue(serviceResult.isSuccess());

        Assert.assertTrue(serviceResult.getResult().getLongitude() > 0 );
        Assert.assertTrue(serviceResult.getResult().getLatitude() > 0 );

    }
}
