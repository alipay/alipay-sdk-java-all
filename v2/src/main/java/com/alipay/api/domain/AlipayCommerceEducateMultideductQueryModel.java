package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询校园支付状态
 *
 * @author auto create
 * @since 1.0, 2025-05-29 16:02:17
 */
public class AlipayCommerceEducateMultideductQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3486334115741745422L;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 学校（或教育机构）内标。支付宝提供的学校编号，如果您不知道学校编号，可以联系您的BD咨询获取
	 */
	@ApiField("school_code")
	private String schoolCode;

	/**
	 * 校园支付token。优先使用「学校或教育机构内标」和「支付宝openid」或「学生或教职工的支付宝uid」，前两者都为空时使用当前参数。需要注意的是，三个参数不能同时为空，且token为空时另两个参数不能为空。
	 */
	@ApiField("token_id")
	private String tokenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSchoolCode() {
		return this.schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getTokenId() {
		return this.tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
