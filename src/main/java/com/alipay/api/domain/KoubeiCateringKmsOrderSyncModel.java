package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 同步外部订单到KDS
 *
 * @author auto create
 * @since 1.0, 2021-03-24 18:51:14
 */
public class KoubeiCateringKmsOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3718465742472819392L;

	/**
	 * 同步动作. "PUSH":推送订单; "CANCEL_PUSH": 取消推送
	 */
	@ApiField("action")
	private String action;

	/**
	 * 推单渠道码. "ELE_ME":饿了么; "KERUYUN":客如云；“YINBAO”:银豹；“DUOWEI”:"多维";如不再此名单则联系口碑技术同学新增；
	 */
	@ApiField("biz_channel")
	private String bizChannel;

	/**
	 * 菜品信息列表. action=PUSH时必填, aciton=CANCEL_PUSH不填
	 */
	@ApiListField("kds_dish_info_list")
	@ApiField("kds_dish_info_d_t_o")
	private List<KdsDishInfoDTO> kdsDishInfoList;

	/**
	 * 订单信息. action=PUSH时必填, aciton=CANCEL_PUSH不填
	 */
	@ApiField("kds_order_info")
	private KdsOrderInfoDTO kdsOrderInfo;

	/**
	 * 口碑订单号.（口碑订单必传）
退款时, 以order_no为主. 如果order_no不存在, 以out_order_no为准.
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 口碑店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 原始订单来源.
ISV订单:isvpos(例如:属于客如云、银豹、多维等ISV厂商自己的POS订单，则传isvpos)；
口碑订单:koubei；
饿了么订单:eleme；
支付宝订单:alipay；
美团订单:meituan；
滴滴订单:didi；
其他平台:other；
	 */
	@ApiField("source")
	private String source;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBizChannel() {
		return this.bizChannel;
	}
	public void setBizChannel(String bizChannel) {
		this.bizChannel = bizChannel;
	}

	public List<KdsDishInfoDTO> getKdsDishInfoList() {
		return this.kdsDishInfoList;
	}
	public void setKdsDishInfoList(List<KdsDishInfoDTO> kdsDishInfoList) {
		this.kdsDishInfoList = kdsDishInfoList;
	}

	public KdsOrderInfoDTO getKdsOrderInfo() {
		return this.kdsOrderInfo;
	}
	public void setKdsOrderInfo(KdsOrderInfoDTO kdsOrderInfo) {
		this.kdsOrderInfo = kdsOrderInfo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
