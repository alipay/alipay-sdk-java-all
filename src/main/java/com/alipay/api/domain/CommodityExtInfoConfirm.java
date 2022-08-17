package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务插件扩展信息BD审核结果
 *
 * @author auto create
 * @since 1.0, 2018-03-16 17:31:50
 */
public class CommodityExtInfoConfirm extends AlipayObject {

	private static final long serialVersionUID = 5568667271418268433L;

	/**
	 * 城市上架结果 【 0：表示失败，  1：表示成功】
	 */
	@ApiField("city_status")
	private String cityStatus;

	/**
	 * 挂载ID，用于确认唯一记录的主键对象
	 */
	@ApiField("displayapp_id")
	private String displayappId;

	/**
	 * 修改城市记录映射对应的原有的挂载id,如果原有服务没有上架城市，该参数为空
	 */
	@ApiField("mapping_displayapp_id")
	private String mappingDisplayappId;

	/**
	 * 城市上架失败原因
	 */
	@ApiField("memo")
	private String memo;

	public String getCityStatus() {
		return this.cityStatus;
	}
	public void setCityStatus(String cityStatus) {
		this.cityStatus = cityStatus;
	}

	public String getDisplayappId() {
		return this.displayappId;
	}
	public void setDisplayappId(String displayappId) {
		this.displayappId = displayappId;
	}

	public String getMappingDisplayappId() {
		return this.mappingDisplayappId;
	}
	public void setMappingDisplayappId(String mappingDisplayappId) {
		this.mappingDisplayappId = mappingDisplayappId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
