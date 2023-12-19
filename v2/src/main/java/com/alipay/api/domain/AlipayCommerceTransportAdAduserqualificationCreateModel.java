package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告用户资质创建
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:02
 */
public class AlipayCommerceTransportAdAduserqualificationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4244146849539512324L;

	/**
	 * 用户id + 广告用户提交信息以及材料来创建对应的资质信息
	 */
	@ApiField("ad_user_id")
	private Long adUserId;

	/**
	 * 广告用户填写的用户资质信息 +  根据广告用户填写的资质信息完成相应的资质创建
	 */
	@ApiField("ad_user_qualification")
	private AdUserQualification adUserQualification;

	public Long getAdUserId() {
		return this.adUserId;
	}
	public void setAdUserId(Long adUserId) {
		this.adUserId = adUserId;
	}

	public AdUserQualification getAdUserQualification() {
		return this.adUserQualification;
	}
	public void setAdUserQualification(AdUserQualification adUserQualification) {
		this.adUserQualification = adUserQualification;
	}

}
