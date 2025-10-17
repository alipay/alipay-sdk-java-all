package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.crowd.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-07 11:47:30
 */
public class AlipayUserDtbankCrowdQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8315959757756252955L;

	/** 
	 * 人群创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	/** 
	 * 人群状态
	 */
	@ApiField("crowd_status")
	private String crowdStatus;

	/** 
	 * 人群失效时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/** 
	 * 归属银行机构ID
	 */
	@ApiField("express_inst_id")
	private String expressInstId;

	/** 
	 * 人群文件下载地址
	 */
	@ApiField("file_info_url")
	private String fileInfoUrl;

	/** 
	 * 匹配成功的支付宝账号数
	 */
	@ApiField("match_user_total_count")
	private Long matchUserTotalCount;

	/** 
	 * 代运营机构ID
	 */
	@ApiField("proxy_bank_inst_id")
	private String proxyBankInstId;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

	public void setCrowdStatus(String crowdStatus) {
		this.crowdStatus = crowdStatus;
	}
	public String getCrowdStatus( ) {
		return this.crowdStatus;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	public Date getExpireTime( ) {
		return this.expireTime;
	}

	public void setExpressInstId(String expressInstId) {
		this.expressInstId = expressInstId;
	}
	public String getExpressInstId( ) {
		return this.expressInstId;
	}

	public void setFileInfoUrl(String fileInfoUrl) {
		this.fileInfoUrl = fileInfoUrl;
	}
	public String getFileInfoUrl( ) {
		return this.fileInfoUrl;
	}

	public void setMatchUserTotalCount(Long matchUserTotalCount) {
		this.matchUserTotalCount = matchUserTotalCount;
	}
	public Long getMatchUserTotalCount( ) {
		return this.matchUserTotalCount;
	}

	public void setProxyBankInstId(String proxyBankInstId) {
		this.proxyBankInstId = proxyBankInstId;
	}
	public String getProxyBankInstId( ) {
		return this.proxyBankInstId;
	}

}
