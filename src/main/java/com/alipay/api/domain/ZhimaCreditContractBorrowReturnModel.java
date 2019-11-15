package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物品归还接口
 *
 * @author auto create
 * @since 1.0, 2019-07-31 14:11:25
 */
public class ZhimaCreditContractBorrowReturnModel extends AlipayObject {

	private static final long serialVersionUID = 8216435545527286139L;

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
	 * 外部订单号
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 商户入驻芝麻服务后，得到的服务id，在服务入驻后台可看到
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 归还的物品列表，包括每本书的唯一id，物品类型，物品名称
	 */
	@ApiField("subjects_returned")
	private String subjectsReturned;

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

	public String getSubjectsReturned() {
		return this.subjectsReturned;
	}
	public void setSubjectsReturned(String subjectsReturned) {
		this.subjectsReturned = subjectsReturned;
	}

}
