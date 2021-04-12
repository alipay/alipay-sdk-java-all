package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建借还记录
 *
 * @author auto create
 * @since 1.0, 2019-07-31 14:11:38
 */
public class ZhimaCreditContractBorrowCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1434697299345275387L;

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
	 * 借书时间，yyyy-MM-dd HH:mm:ss格式的时间字符串
	 */
	@ApiField("gmt_borrow")
	private String gmtBorrow;

	/**
	 * 应还时间，yyyy-MM-dd HH:mm:ss格式的时间字符串
	 */
	@ApiField("gmt_due")
	private String gmtDue;

	/**
	 * 商户自定义的外部订单号，需要保障唯一性。
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 商户入驻芝麻服务后，得到的服务id，在服务入驻后台可看到
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 借的物品列表，包括每个物品的唯一id，物品类型，物品名称。目前type仅支持book：图书
	 */
	@ApiField("subjects_borrowed")
	private String subjectsBorrowed;

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

	public String getGmtBorrow() {
		return this.gmtBorrow;
	}
	public void setGmtBorrow(String gmtBorrow) {
		this.gmtBorrow = gmtBorrow;
	}

	public String getGmtDue() {
		return this.gmtDue;
	}
	public void setGmtDue(String gmtDue) {
		this.gmtDue = gmtDue;
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

	public String getSubjectsBorrowed() {
		return this.subjectsBorrowed;
	}
	public void setSubjectsBorrowed(String subjectsBorrowed) {
		this.subjectsBorrowed = subjectsBorrowed;
	}

}
