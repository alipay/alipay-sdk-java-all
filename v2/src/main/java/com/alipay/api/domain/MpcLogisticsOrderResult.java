package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云物流详情结果
 *
 * @author auto create
 * @since 1.0, 2024-06-04 20:14:20
 */
public class MpcLogisticsOrderResult extends AlipayObject {

	private static final long serialVersionUID = 8199142727481528777L;

	/**
	 * 物流公司代码
	 */
	@ApiField("logistics_company_code")
	private String logisticsCompanyCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_company_name")
	private String logisticsCompanyName;

	/**
	 * 物流详情
	 */
	@ApiListField("logistics_detail_list")
	@ApiField("mpc_logistics_detail")
	private List<MpcLogisticsDetail> logisticsDetailList;

	/**
	 * 物流单号
	 */
	@ApiField("mail_no")
	private String mailNo;

	public String getLogisticsCompanyCode() {
		return this.logisticsCompanyCode;
	}
	public void setLogisticsCompanyCode(String logisticsCompanyCode) {
		this.logisticsCompanyCode = logisticsCompanyCode;
	}

	public String getLogisticsCompanyName() {
		return this.logisticsCompanyName;
	}
	public void setLogisticsCompanyName(String logisticsCompanyName) {
		this.logisticsCompanyName = logisticsCompanyName;
	}

	public List<MpcLogisticsDetail> getLogisticsDetailList() {
		return this.logisticsDetailList;
	}
	public void setLogisticsDetailList(List<MpcLogisticsDetail> logisticsDetailList) {
		this.logisticsDetailList = logisticsDetailList;
	}

	public String getMailNo() {
		return this.mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}

}
