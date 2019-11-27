package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DishGoodsDO;
import com.alipay.api.domain.UserDishRelationDO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.shopdishorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOfflineProviderShopdishorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5246776223488549521L;

	/** 
	 * 支付类型  
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 channel字段。
支付来源渠道使用值：alipay(支付宝支付) 、weixin(微信支付)、other(其他支付渠道)。如果是支付宝支付传入alipay，如果是微信传入：weixin  其他的支付都传入：other
	 */
	@ApiField("channel")
	private String channel;

	/** 
	 * 对菜品的描备注 
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 description  字段。
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 详情跳转的URL  
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 detailUrl  字段。
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/** 
	 * 优惠价格  
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 discountPrice  字段。
	 */
	@ApiField("discount_price")
	private String discountPrice;

	/** 
	 * 点菜订单里面的菜品对象。
	 */
	@ApiListField("list")
	@ApiField("dish_goods_d_o")
	private List<DishGoodsDO> list;

	/** 
	 * 订单状态
当前值来自于alipay.offline.provider.useraction.record商户操作行为接口中上传用户点菜菜单中的dish对象的status   字段
11 用户下单、等待商家确认
12 商家已经确认
13 商家确认，等待支付
14 支付完成，结账成功
15 点菜关闭
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/** 
	 * 外部订单号 
数据为alipay.offline.provider.useraction.record接口中上传用户点菜菜单作为元数据。当前的outer_order_id  就是上传用户点菜菜单中action_detail对象里的outOrderId字段
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/** 
	 * 交易流水号
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 payOrderNo字段。
交易流水号，在创建支付宝交易的时候，会拿到一个流水号，一般是以当前年开始，比如：2017XXXXX
	 */
	@ApiField("pay_order_no")
	private String payOrderNo;

	/** 
	 * 点菜的支付时间  
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 payTime  字段。
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 消费的人数
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 people  字段。
	 */
	@ApiField("people")
	private Long people;

	/** 
	 * 实际支付金额 
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 realPrice  字段。
	 */
	@ApiField("real_price")
	private String realPrice;

	/** 
	 * 桌位号
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 tableCode  字段。
	 */
	@ApiField("table_code")
	private String tableCode;

	/** 
	 * 订单价格 
当前值来自于alipay.offline.provider.useraction.record 商户操作行为接口中上传用户点菜菜单 的action_detail对象里面的 totalPrice  字段。
	 */
	@ApiField("total_price")
	private String totalPrice;

	/** 
	 * 与当前订单有关系的用户数据列表
	 */
	@ApiListField("user_dish_relation_list")
	@ApiField("user_dish_relation_d_o")
	private List<UserDishRelationDO> userDishRelationList;

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getChannel( ) {
		return this.channel;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}
	public String getDetailUrl( ) {
		return this.detailUrl;
	}

	public void setDiscountPrice(String discountPrice) {
		this.discountPrice = discountPrice;
	}
	public String getDiscountPrice( ) {
		return this.discountPrice;
	}

	public void setList(List<DishGoodsDO> list) {
		this.list = list;
	}
	public List<DishGoodsDO> getList( ) {
		return this.list;
	}

	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Long getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}
	public String getOuterOrderId( ) {
		return this.outerOrderId;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}
	public String getPayOrderNo( ) {
		return this.payOrderNo;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
	}

	public void setPeople(Long people) {
		this.people = people;
	}
	public Long getPeople( ) {
		return this.people;
	}

	public void setRealPrice(String realPrice) {
		this.realPrice = realPrice;
	}
	public String getRealPrice( ) {
		return this.realPrice;
	}

	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}
	public String getTableCode( ) {
		return this.tableCode;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getTotalPrice( ) {
		return this.totalPrice;
	}

	public void setUserDishRelationList(List<UserDishRelationDO> userDishRelationList) {
		this.userDishRelationList = userDishRelationList;
	}
	public List<UserDishRelationDO> getUserDishRelationList( ) {
		return this.userDishRelationList;
	}

}
