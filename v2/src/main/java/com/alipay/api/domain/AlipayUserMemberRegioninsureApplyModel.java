package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险预下单和出单申请
 *
 * @author auto create
 * @since 1.0, 2023-10-20 11:38:24
 */
public class AlipayUserMemberRegioninsureApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7834495138662742645L;

	/**
	 * 商户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 从插件获取的bizId
	 */
	@ApiField("xlight_biz_id")
	private String xlightBizId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getXlightBizId() {
		return this.xlightBizId;
	}
	public void setXlightBizId(String xlightBizId) {
		this.xlightBizId = xlightBizId;
	}

}
