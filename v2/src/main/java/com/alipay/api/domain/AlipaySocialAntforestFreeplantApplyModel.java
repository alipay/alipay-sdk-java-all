package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 0g能量兑换蚂蚁森林树种
 *
 * @author auto create
 * @since 1.0, 2025-07-09 16:17:17
 */
public class AlipaySocialAntforestFreeplantApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7123562959434563872L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 上游业务方自己定规则,保证全局唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 森林树项目ID，联系森林业务提供
	 */
	@ApiField("project_id")
	private Long projectId;

	/**
	 * 访问来源，业务自己定
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

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

	public Long getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
