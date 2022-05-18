package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 爱心捐赠代扣查询
 *
 * @author auto create
 * @since 1.0, 2022-03-01 14:41:45
 */
public class AlipayUserCharityWithholdQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4326252377632952262L;

	/**
	 * 业务场景，由爱心捐赠系统配置及分配
	 */
	@ApiField("biz_id")
	private String bizId;

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
	 * 交易用户的ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 商户ID
	 */
	@ApiField("withhold_pid")
	private String withholdPid;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
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
