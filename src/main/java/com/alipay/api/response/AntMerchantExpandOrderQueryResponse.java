package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-25 14:12:23
 */
public class AntMerchantExpandOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1512578792512752318L;

	/** 
	 * 申请单创建时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/** 
	 * 返回申请单相关参数。当前返回内容有cardAliasNo，smid
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 商户角色id。间连商户或平台商二级商户业务中，本字段表示smid。审核通过后生成。
	 */
	@ApiListField("ip_role_id")
	@ApiField("string")
	private List<String> ipRoleId;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 申请单状态。枚举支持：
99：已完结；
-1：失败；
031：已提交审核。
	 */
	@ApiField("status")
	private String status;

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getApplyTime( ) {
		return this.applyTime;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setIpRoleId(List<String> ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public List<String> getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
