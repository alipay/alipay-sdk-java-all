package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推荐
 *
 * @author auto create
 * @since 1.0, 2018-11-28 16:15:07
 */
public class AlipayOpenDataItemRecommendBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5827775782388234139L;

	/**
	 * 国家地区行政编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 展位ID,支持批量咨询，多个展位用逗号分隔
	 */
	@ApiField("position_ids")
	private String positionIds;

	/**
	 * 用户的支付宝UID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPositionIds() {
		return this.positionIds;
	}
	public void setPositionIds(String positionIds) {
		this.positionIds = positionIds;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
