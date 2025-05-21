package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业相关数据采集接收
 *
 * @author auto create
 * @since 1.0, 2024-12-25 11:33:56
 */
public class ZhimaCreditEpDataReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 6641978261457754945L;

	/**
	 * 用于接收商户上传的企业相关数据，例如招投标报告的部分附件信息
	 */
	@ApiListField("data_info")
	@ApiField("ep_report_data_info")
	private List<EpReportDataInfo> dataInfo;

	/**
	 * 统一社会信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业全称，对于招投标订单，传入投标的企业全称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 企信返回的业务订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 订单所属业务类型
	 */
	@ApiField("order_type")
	private String orderType;

	public List<EpReportDataInfo> getDataInfo() {
		return this.dataInfo;
	}
	public void setDataInfo(List<EpReportDataInfo> dataInfo) {
		this.dataInfo = dataInfo;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

}
