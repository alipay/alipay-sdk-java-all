package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 泛行业教培订单信息同步
 *
 * @author auto create
 * @since 1.0, 2025-08-06 17:12:35
 */
public class AlipayCommerceFhyeduOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5166278195448515955L;

	/**
	 * null
	 */
	@ApiListField("course_detail_list")
	@ApiField("edu_order_course_detail")
	private List<EduOrderCourseDetail> courseDetailList;

	/**
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 机构id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 机构电话
	 */
	@ApiField("inst_phone")
	private String instPhone;

	/**
	 * 最近支付时间
	 */
	@ApiField("last_payment_time")
	private Date lastPaymentTime;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * null
	 */
	@ApiListField("payment_list")
	@ApiField("edu_order_payment_detail")
	private List<EduOrderPaymentDetail> paymentList;

	/**
	 * 学员id
	 */
	@ApiField("student_id")
	private String studentId;

	/**
	 * 学生名称
	 */
	@ApiField("student_name")
	private String studentName;

	public List<EduOrderCourseDetail> getCourseDetailList() {
		return this.courseDetailList;
	}
	public void setCourseDetailList(List<EduOrderCourseDetail> courseDetailList) {
		this.courseDetailList = courseDetailList;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getInstPhone() {
		return this.instPhone;
	}
	public void setInstPhone(String instPhone) {
		this.instPhone = instPhone;
	}

	public Date getLastPaymentTime() {
		return this.lastPaymentTime;
	}
	public void setLastPaymentTime(Date lastPaymentTime) {
		this.lastPaymentTime = lastPaymentTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<EduOrderPaymentDetail> getPaymentList() {
		return this.paymentList;
	}
	public void setPaymentList(List<EduOrderPaymentDetail> paymentList) {
		this.paymentList = paymentList;
	}

	public String getStudentId() {
		return this.studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
