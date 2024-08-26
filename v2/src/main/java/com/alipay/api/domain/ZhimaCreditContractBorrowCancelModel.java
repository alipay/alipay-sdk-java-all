package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借还合约取消接口
 *
 * @author auto create
 * @since 1.0, 2022-11-03 11:50:01
 */
public class ZhimaCreditContractBorrowCancelModel extends AlipayObject {

	private static final long serialVersionUID = 8583114892176883553L;

	/**
	 * 外部类目,样例：图书馆:BOOK
	 */
	@ApiField("category")
	private String category;

	/**
	 * 扩展字段，目前留空
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 商户自定义的外部订单号
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 商户入驻芝麻服务后，得到的服务id，在服务入驻后台可看到
	 */
	@ApiField("service_id")
	private String serviceId;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getOutTransNo() {
		return this.outTransNo;
	}
	public void setOutTransNo(String outTransNo) {
		this.outTransNo = outTransNo;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
