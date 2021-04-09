package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务信息同步(服务商->支付宝) API
 *
 * @author auto create
 * @since 1.0, 2021-01-28 14:43:36
 */
public class AlipayInsSceneInsserviceprodSerinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6612544178636682495L;

	/**
	 * 支付宝的服务产品编号
也就是服务出单接口中收到的那个ant_ser_prod_no
	 */
	@ApiField("ant_ser_prod_no")
	private String antSerProdNo;

	/**
	 * 支付宝的单据编号
	 */
	@ApiField("ser_biz_no")
	private String serBizNo;

	/**
	 * 当ser_biz_type=APPLY表示ser_biz_no的值是服务记录编号；
当ser_biz_type=REFUND表示ser_biz_no的值是售中退款单编号；
当ser_biz_type=SURRENDER表示ser_biz_no的值是售后退款单编号
	 */
	@ApiField("ser_biz_type")
	private String serBizType;

	/**
	 * key是服务信息的标识，
value是具体的服务信息List。具体的结构定义请见《服务信息结构定义》
	 */
	@ApiField("service_info")
	private String serviceInfo;

	public String getAntSerProdNo() {
		return this.antSerProdNo;
	}
	public void setAntSerProdNo(String antSerProdNo) {
		this.antSerProdNo = antSerProdNo;
	}

	public String getSerBizNo() {
		return this.serBizNo;
	}
	public void setSerBizNo(String serBizNo) {
		this.serBizNo = serBizNo;
	}

	public String getSerBizType() {
		return this.serBizType;
	}
	public void setSerBizType(String serBizType) {
		this.serBizType = serBizType;
	}

	public String getServiceInfo() {
		return this.serviceInfo;
	}
	public void setServiceInfo(String serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

}
