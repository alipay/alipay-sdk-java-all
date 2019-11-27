package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.myisvorderreserved.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineProviderMyisvorderreservedQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8263947612979711166L;

	/** 
	 * 更新的原因（比如关闭为什么关闭）  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的closeReason字段值。
	 */
	@ApiField("close_reason")
	private String closeReason;

	/** 
	 * 联系人（会与性别一起在平台联合展示）  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的contactsName  字段值。
	 */
	@ApiField("contacts_name")
	private String contactsName;

	/** 
	 * 详情跳转的URL  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的detailUrl  字段值。
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/** 
	 * 外部订单号 
数据为alipay.offline.provider.useraction.record接口中上传用户预定订单信息作为元数据。当前的outer_order_id  就是上传用户预定订单中action_detail对象里的outOrderId字段
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/** 
	 * 提交的预约人数  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的people  字段值。
	 */
	@ApiField("people")
	private Long people;

	/** 
	 * 预约时间，到毫秒  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的reserveTime  字段值。
	 */
	@ApiField("reserve_time")
	private Long reserveTime;

	/** 
	 * 联系人性别，只有F与M两个值。 F：男  M： 女  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的sex字段值。
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 订单状态
  31待商家确认 32 预定成功 33 预定失败,商家拒绝 34 已经取消 35 已经就坐  
当前值来自于 alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的orderStatus 字段值。
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 包厢、小桌、等ISV名称  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的tableName  字段值。
	 */
	@ApiField("table_name")
	private String tableName;

	/** 
	 * 预约人联系号码  
当前值来自于
alipay.offline.provider.useraction.record商户操作行为接口中插入预定订单信息 的action_detail对象里的telephone  字段值。
	 */
	@ApiField("telephone")
	private String telephone;

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}
	public String getCloseReason( ) {
		return this.closeReason;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	public String getContactsName( ) {
		return this.contactsName;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getDetailUrl( ) {
		return this.detailUrl;
	}

	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}
	public String getOuterOrderId( ) {
		return this.outerOrderId;
	}

	public void setPeople(Long people) {
		this.people = people;
	}
	public Long getPeople( ) {
		return this.people;
	}

	public void setReserveTime(Long reserveTime) {
		this.reserveTime = reserveTime;
	}
	public Long getReserveTime( ) {
		return this.reserveTime;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex( ) {
		return this.sex;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getTableName( ) {
		return this.tableName;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getTelephone( ) {
		return this.telephone;
	}

}
