package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义藏品查询
 *
 * @author auto create
 * @since 1.0, 2026-04-14 16:27:46
 */
public class AnttechNftSkuCustomizeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4376172636381396436L;

	/**
	 * 活动ID
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 用户Id
	 */
	@ApiField("fans_id")
	private String fansId;

	/**
	 * 用户ID类型
	 */
	@ApiField("fans_id_type")
	private String fansIdType;

	/**
	 * skuId
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 合作方交易唯一识别号
	 */
	@ApiField("third_biz_no")
	private String thirdBizNo;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getFansId() {
		return this.fansId;
	}
	public void setFansId(String fansId) {
		this.fansId = fansId;
	}

	public String getFansIdType() {
		return this.fansIdType;
	}
	public void setFansIdType(String fansIdType) {
		this.fansIdType = fansIdType;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getThirdBizNo() {
		return this.thirdBizNo;
	}
	public void setThirdBizNo(String thirdBizNo) {
		this.thirdBizNo = thirdBizNo;
	}

}
