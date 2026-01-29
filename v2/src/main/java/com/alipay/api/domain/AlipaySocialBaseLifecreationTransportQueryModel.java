package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创作搬运内容信息文件获取
 *
 * @author auto create
 * @since 1.0, 2024-09-10 10:07:03
 */
public class AlipaySocialBaseLifecreationTransportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2459472515833216961L;

	/**
	 * 查询业务日期，仅支持 yyyy-MM-dd 格式
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 创作搬运合作的供应商结构编码
	 */
	@ApiField("org_code")
	private String orgCode;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getOrgCode() {
		return this.orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

}
