package cn.fmachine.service.impl;

import cn.fmachine.entity.*;
import cn.fmachine.service.IHouseService;
import cn.fmachine.util.UpLoadFile;

import java.util.List;
import java.util.Map;

/**
 * HouseServiceImpl
 * COPYRIGHT ©2014-2024, FMACHINE.CN, ALL RIGHTS RESERVED
 *
 * @author XIN MING
 * @since 7/23/15
 */
public class HouseServiceImpl implements IHouseService {
    @Override
    public boolean save(House house, UpLoadFile file) {
        return false;
    }

    @Override
    public void delete(House house) {

    }

    @Override
    public boolean update(House house, UpLoadFile file) {
        return false;
    }

    @Override
    public House findById(Integer id) {
        return null;
    }

    @Override
    public HousePicture getPictureById(Integer id) {
        return null;
    }

    @Override
    public Object[] findAll(Map<String, Object> params) {
        return new Object[0];
    }

    @Override
    public List<HouseType> findTypeList() {
        return null;
    }

    @Override
    public List<District> findDistrictList() {
        return null;
    }

    @Override
    public List<Street> findStreetListByDisId(int disId) {
        return null;
    }
}
