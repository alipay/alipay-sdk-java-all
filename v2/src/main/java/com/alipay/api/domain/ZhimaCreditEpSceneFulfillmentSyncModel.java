package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务履约同步
 *
 * @author auto create
 * @since 1.0, 2021-10-27 17:13:06
 */
public class ZhimaCreditEpSceneFulfillmentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2581364982854671792L;

	/**
	 * 特定业务场景传输的扩展参数，以JSON形式传输。具体业务场景需要传入参数请参考<a href="https://docs.open.alipay.com/11270#s3">业务场景传输的扩展参数</a>
	 */
	@ApiField("biz_ext_param")
	private String bizExtParam;

	/**
	 * 业务时间，日期格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 信用订单号，为<a href="https://opendocs.alipay.com/apis/api_8/zhima.credit.ep.scene.agreement.use">zhima.credit.ep.scene.agreement.use</a>接口加入信用服务后获取的credit_order_no（信用订单号）。
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	/**
	 * 商户请求订单号，必须唯一。用于唯一标识商户的一笔履约调用。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	public String getBizExtParam() {
		return this.bizExtParam;
	}
	public void setBizExtParam(String bizExtParam) {
		this.bizExtParam = bizExtParam;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public String getCreditOrderNo() {
		return this.creditOrderNo;
	}
	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

}
