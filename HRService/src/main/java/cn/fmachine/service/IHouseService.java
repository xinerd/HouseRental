package cn.fmachine.service;

import java.util.List;
import java.util.Map;

import cn.fmachine.entity.District;
import cn.fmachine.entity.House;
import cn.fmachine.entity.HousePicture;
import cn.fmachine.entity.HouseType;
import cn.fmachine.entity.Street;
import cn.fmachine.util.Page;
import cn.fmachine.util.UpLoadFile;

public interface IHouseService {

	/**
	 * 保存房屋
	 * @param house
	 */
	public boolean save(House house, UpLoadFile file);

	/**
	 * 删除房屋
	 * @param house
	 */
	public void delete(House house);

	/**
	 * 修改房屋
	 * @param house
	 */
	public boolean update(House house, UpLoadFile file);

	/**
	 * 根据Id获取房屋
	 * @param id
	 */
	public House findById(Integer id);

	/**
	 * 根据houseId获取房屋图片对象
	 * @param id
	 */
	public HousePicture getPictureById(Integer id);
	
	/**
	 * 查询所有房屋列表
	 * @param params
	 */
	public Object[] findAll(Map<String, Object> params);
	
	/**
	 * 查询所有房屋类型列表
	 */
	public List<HouseType> findTypeList();
	
	/**
	 * 查询所有区列表
	 */
	public List<District> findDistrictList();

	/**
	 * 根据区id查询所有街道列表
	 */
	public List<Street> findStreetListByDisId(int disId);

}
