package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-14 12:00:48
 */
public class AlipayOverseasTaxOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7847778351936427998L;

	/** 
	 * 用于识别用户支付宝账号的号码，由identify_account_type指定类型:
identify_account_type为barcode表示支付宝钱包付款码，退税公司通过扫描用户支付宝钱包付款码获取
	 */
	@ApiField("identify_account_no")
	private String identifyAccountNo;

	/** 
	 * 用于识别用户支付宝账号的类型
条码退税，取值：barcode
	 */
	@ApiField("identify_account_type")
	private String identifyAccountType;

	/** 
	 * 退税机构业务流水号，唯一，由退税机构生成，只能包含英字母、数字，长度不能小于3且不能大于64
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 退税状态，S 表示退税成功；F表示退税失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 退税成功时间，只有status为S时才有值，时间格式：YYYY-MM-DD HH:MM:SS，北京时间24小时制，时区东八区
	 */
	@ApiField("success_time")
	private Date successTime;

	/** 
	 * 支付宝的退税序列号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public void setIdentifyAccountNo(String identifyAccountNo) {
		this.identifyAccountNo = identifyAccountNo;
	}
	public String getIdentifyAccountNo( ) {
		return this.identifyAccountNo;
	}

	public void setIdentifyAccountType(String identifyAccountType) {
		this.identifyAccountType = identifyAccountType;
	}
	public String getIdentifyAccountType( ) {
		return this.identifyAccountType;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}
	public Date getSuccessTime( ) {
		return this.successTime;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public String getTaxNo( ) {
		return this.taxNo;
	}

}
