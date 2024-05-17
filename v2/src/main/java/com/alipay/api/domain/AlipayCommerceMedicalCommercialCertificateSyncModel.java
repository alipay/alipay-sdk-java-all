package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业商业化会员卡兑换凭证同步接口
 *
 * @author auto create
 * @since 1.0, 2024-03-13 10:03:48
 */
public class AlipayCommerceMedicalCommercialCertificateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8857516246346682295L;

	/**
	 * 用户兑换凭证的实际业务时间，默认为系统当前时间
	 */
	@ApiField("business_date")
	private Date businessDate;

	/**
	 * 用户openid，唯一映射用户userid，用于唯一标识用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户兑换开通凭证的唯一业务流水号
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 凭证兑换目标，如用户所兑换会员卡商品的sku_id
	 */
	@ApiField("target")
	private String target;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户兑换凭证时登陆或指定的手机号码，仅支持中国大陆11位手机号
	 */
	@ApiField("user_mobile")
	private String userMobile;

	public Date getBusinessDate() {
		return this.businessDate;
	}
	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getTarget() {
		return this.target;
	}
	public void setTarget(String target) {
		this.target = target;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserMobile() {
		return this.userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

}
