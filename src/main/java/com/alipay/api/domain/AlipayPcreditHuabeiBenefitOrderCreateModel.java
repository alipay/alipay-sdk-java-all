package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 花呗权益订单创建并且发送权益
 *
 * @author auto create
 * @since 1.0, 2019-02-19 20:30:50
 */
public class AlipayPcreditHuabeiBenefitOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8272588547331534663L;

	/**
	 * 支付宝业务单据号，在scene=BLUE_ARROW时候，必填，且值为先享协议号
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 业务自定义参数，例如权益账务相关数据通过该字段传递
[
    {
      "key1": "value1"
    },
    {
      "key2": "value2"
    }
  ]
	 */
	@ApiListField("biz_param")
	@ApiField("key_value_pair")
	private List<KeyValuePair> bizParam;

	/**
	 * 商户端业务发生时间(yyyy-MM-dd HH:mm:ss)
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/**
	 * 是否需要多次触发。权益打包和多次触发场景会有为true，默认为false
	 */
	@ApiField("need_repeat")
	private Boolean needRepeat;

	/**
	 * 权益商品id
	 */
	@ApiField("out_goods_id")
	private String outGoodsId;

	/**
	 * 商户本次操作的请求流水号，用于标示请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。支付宝侧用来做请求的幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 权益商品sku_id，如果此项为空，会发放out_goods_id里面对应的所有sku
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商户请求场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 是否立即触发发放。默认为false。蓝箭项目里面需要将此项设置为true
	 */
	@ApiField("trigger_send")
	private Boolean triggerSend;

	public String getAlipayBizNo() {
		return this.alipayBizNo;
	}
	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public List<KeyValuePair> getBizParam() {
		return this.bizParam;
	}
	public void setBizParam(List<KeyValuePair> bizParam) {
		this.bizParam = bizParam;
	}

	public Date getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}

	public Boolean getNeedRepeat() {
		return this.needRepeat;
	}
	public void setNeedRepeat(Boolean needRepeat) {
		this.needRepeat = needRepeat;
	}

	public String getOutGoodsId() {
		return this.outGoodsId;
	}
	public void setOutGoodsId(String outGoodsId) {
		this.outGoodsId = outGoodsId;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public Boolean getTriggerSend() {
		return this.triggerSend;
	}
	public void setTriggerSend(Boolean triggerSend) {
		this.triggerSend = triggerSend;
	}

}
