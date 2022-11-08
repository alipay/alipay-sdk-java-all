package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 爱心捐赠代扣发起
 *
 * @author auto create
 * @since 1.0, 2022-10-25 21:05:15
 */
public class AlipayUserCharityWithholdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8493978467178251293L;

	/**
	 * 业务场景，由爱心捐赠系统配置及分配
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扣款金额，单位为分
	 */
	@ApiField("donate_amount")
	private Long donateAmount;

	/**
	 * 扩展信息，json格式字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 交易用户的user_id对应的open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 产品码，由爱心捐赠系统配置及分配
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 项目ID
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 交易用户的ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 需要签约协议的用户PID
	 */
	@ApiField("withhold_pid")
	private String withholdPid;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getDonateAmount() {
		return this.donateAmount;
	}
	public void setDonateAmount(Long donateAmount) {
		this.donateAmount = donateAmount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWithholdPid() {
		return this.withholdPid;
	}
	public void setWithholdPid(String withholdPid) {
		this.withholdPid = withholdPid;
	}

}
