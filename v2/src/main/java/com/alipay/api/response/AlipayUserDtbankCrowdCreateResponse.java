package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.crowd.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-22 14:17:34
 */
public class AlipayUserDtbankCrowdCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2479218567512971915L;

	/** 
	 * 创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 人群状态
	 */
	@ApiField("crowd_status")
	private String crowdStatus;

	/** 
	 * 归属银行机构ID
	 */
	@ApiField("express_inst_id")
	private String expressInstId;

	/** 
	 * 外部业务单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 代运营方机构ID
	 */
	@ApiField("proxy_bank_inst_id")
	private String proxyBankInstId;

	/** 
	 * 用户信息
	 */
	@ApiField("user_info")
	private String userInfo;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setCrowdStatus(String crowdStatus) {
		this.crowdStatus = crowdStatus;
	}
	public String getCrowdStatus( ) {
		return this.crowdStatus;
	}

	public void setExpressInstId(String expressInstId) {
		this.expressInstId = expressInstId;
	}
	public String getExpressInstId( ) {
		return this.expressInstId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setProxyBankInstId(String proxyBankInstId) {
		this.proxyBankInstId = proxyBankInstId;
	}
	public String getProxyBankInstId( ) {
		return this.proxyBankInstId;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	public String getUserInfo( ) {
		return this.userInfo;
	}

}
