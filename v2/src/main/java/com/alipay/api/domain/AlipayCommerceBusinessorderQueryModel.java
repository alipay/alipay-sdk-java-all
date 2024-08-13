package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 业务记录查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-14 20:07:05
 */
public class AlipayCommerceBusinessorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2766667619976328796L;

	/**
	 * 查询办事记录的时间区间中的开始时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("begin_time")
	private String beginTime;

	/**
	 * 查询办事记录的时间区间中的结束时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * isv的appid
	 */
	@ApiField("isv_appid")
	private String isvAppid;

	/**
	 * 用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 分页查询的起始页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页查询的每页数据量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询的办事记录所属服务展台（如城市服务为CITY_SERVICE，车主平台为MYCAR_SERVICE等）
	 */
	@ApiField("platform_type")
	private String platformType;

	/**
	 * 办事记录状态列表
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	/**
	 * 支付宝userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBeginTime() {
		return this.beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsvAppid() {
		return this.isvAppid;
	}
	public void setIsvAppid(String isvAppid) {
		this.isvAppid = isvAppid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPlatformType() {
		return this.platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
