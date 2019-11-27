package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.waitnumber.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineProviderWaitnumberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8861519267189826322L;

	/** 
	 * 用户信誉值  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的credit就是上传用户排号订单中action_detail对象里的credit字段
	 */
	@ApiField("credit")
	private Long credit;

	/** 
	 * 描述：变更提示（取号成功）  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的desc就是上传用户排号订单中action_detail对象里的desc字段
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 跳转的原始URL  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的detail_url  就是上传用户排号订单中action_detail对象里的desc字段detailUrl
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/** 
	 * 用户手机号码  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的mobile 就是上传用户排号订单中action_detail对象里的mobile字段
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 领取号码 
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的num就是上传用户排号订单中action_detail对象里的num字段
	 */
	@ApiField("num")
	private String num;

	/** 
	 * 外部订单号 
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据。当前的outer_order_id  就是上传用户排号订单中action_detail对象里的outOrderId字段
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/** 
	 * 过号顺延不顺延文案  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据。当前的pass_num_desc就是上传用户排号订单中action_detail对象里的passNumDesc
	 */
	@ApiField("pass_num_desc")
	private String passNumDesc;

	/** 
	 * 过号怎么处理（-1：不可知 0 顺延 1：不可顺延） 
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的pass_num_type就是上传用户排号订单中action_detail对象里的passNumType字段
	 */
	@ApiField("pass_num_type")
	private Long passNumType;

	/** 
	 * 领取人数  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的people  就是上传用户排号订单中action_detail对象里的people  字段
	 */
	@ApiField("people")
	private Long people;

	/** 
	 * 队列属性（1-2人）
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的qattr就是上传用户排号订单中action_detail对象里的qattr字段
	 */
	@ApiField("qattr")
	private String qattr;

	/** 
	 * 队列领取名称（小桌、中桌）领号失败可能没有  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的qname就是上传用户排号订单中action_detail对象里的qname字段
	 */
	@ApiField("qname")
	private String qname;

	/** 
	 * 商户店铺名称  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的shop_name  就是上传用户排号订单中action_detail对象里的shopName  字段
	 */
	@ApiField("shop_name")
	private String shopName;

	/** 
	 * 排号单状态
排号：2、成功取号 4、叫号中 5 就餐  6 过号 7 取消  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的orderStatus  就是上传用户排号订单中action_detail对象里的orderStatus  字段
	 */
	@ApiField("status")
	private Long status;

	/** 
	 * 队列类型 0,1,2  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的type就是上传用户排号订单中action_detail对象里的type字段
	 */
	@ApiField("type")
	private String type;

	/** 
	 * 排号等待人数  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的wait就是上传用户排号订单中action_detail对象里的wait字段
	 */
	@ApiField("wait")
	private Long wait;

	/** 
	 * 预计等待时间  
数据为alipay.offline.provider.useraction.record接口中上传用户排号订单作为元数据，通过分析得到的数据。当前的wait_time就是上传用户排号订单中action_detail对象里的waitTime字段
	 */
	@ApiField("wait_time")
	private String waitTime;

	public void setCredit(Long credit) {
		this.credit = credit;
	}
	public Long getCredit( ) {
		return this.credit;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getDetailUrl( ) {
		return this.detailUrl;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getNum( ) {
		return this.num;
	}

	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}
	public String getOuterOrderId( ) {
		return this.outerOrderId;
	}

	public void setPassNumDesc(String passNumDesc) {
		this.passNumDesc = passNumDesc;
	}
	public String getPassNumDesc( ) {
		return this.passNumDesc;
	}

	public void setPassNumType(Long passNumType) {
		this.passNumType = passNumType;
	}
	public Long getPassNumType( ) {
		return this.passNumType;
	}

	public void setPeople(Long people) {
		this.people = people;
	}
	public Long getPeople( ) {
		return this.people;
	}

	public void setQattr(String qattr) {
		this.qattr = qattr;
	}
	public String getQattr( ) {
		return this.qattr;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}
	public String getQname( ) {
		return this.qname;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopName( ) {
		return this.shopName;
	}

	public void setStatus(Long status) {
		this.status = status;
	}
	public Long getStatus( ) {
		return this.status;
	}

	public void setType(String type) {
		this.type = type;
	}
	public String getType( ) {
		return this.type;
	}

	public void setWait(Long wait) {
		this.wait = wait;
	}
	public Long getWait( ) {
		return this.wait;
	}

	public void setWaitTime(String waitTime) {
		this.waitTime = waitTime;
	}
	public String getWaitTime( ) {
		return this.waitTime;
	}

}
