package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.partnerships.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-21 08:56:43
 */
public class AlipayMarketingPartnershipsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1853563847557557541L;

	/** 
	 * 建立合作关系的时间。格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 合作状态，枚举值：
ESTABLISHED：已建立
TERMINATED：已终止
	 */
	@ApiField("status")
	private String status;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
