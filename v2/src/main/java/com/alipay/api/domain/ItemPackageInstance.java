package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单项资源包实例详情列表
 *
 * @author auto create
 * @since 1.0, 2023-11-03 14:46:29
 */
public class ItemPackageInstance extends AlipayObject {

	private static final long serialVersionUID = 2763413179353173875L;

	/**
	 * 商品编码
	 */
	@ApiField("commodity_code")
	private String commodityCode;

	/**
	 * 商品名称
	 */
	@ApiField("commodity_name")
	private String commodityName;

	/**
	 * 结束时间，为13位的UNIX时间戳
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 商品规格编码
	 */
	@ApiField("spec_code")
	private String specCode;

	/**
	 * 资源包规格实例ID
	 */
	@ApiField("spec_instance_id")
	private String specInstanceId;

	/**
	 * 商品规格名称
	 */
	@ApiField("spec_name")
	private String specName;

	/**
	 * 开始时间，为13位的UNIX时间戳
	 */
	@ApiField("start_time")
	private String startTime;

	public String getCommodityCode() {
		return this.commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityName() {
		return this.commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecInstanceId() {
		return this.specInstanceId;
	}
	public void setSpecInstanceId(String specInstanceId) {
		this.specInstanceId = specInstanceId;
	}

	public String getSpecName() {
		return this.specName;
	}
	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
