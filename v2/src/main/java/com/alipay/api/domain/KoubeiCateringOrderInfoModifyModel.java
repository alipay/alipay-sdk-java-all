package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 餐饮pos业务订单修改
 *
 * @author auto create
 * @since 1.0, 2022-07-01 16:24:58
 */
public class KoubeiCateringOrderInfoModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5473137451152473265L;

	/**
	 * 触发订单更新的操作类型，比如:
加菜：ADD_DISH；
减菜：SUBSTRACT_DISH；
转台：SWITCH_TABLE；
菜状态变迁：DISH_STATUS_CHANGE
订单信息更新(比如服务费等)：ORDER_MODIFY
其他：OTHER
	 */
	@ApiField("action")
	private String action;

	/**
	 * 订单最新菜明细列表
	 */
	@ApiListField("dish_details")
	@ApiField("kb_pos_order_dish_detail")
	private List<KbPosOrderDishDetail> dishDetails;

	/**
	 * 扩展信息，json对象格式，key和value都为字符串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 其他杂费,以元为单位,精确到分
	 */
	@ApiField("other_amount")
	private String otherAmount;

	/**
	 * 打包费,以元为单位,精确到分
	 */
	@ApiField("packing_amount")
	private String packingAmount;

	/**
	 * 用餐人数
	 */
	@ApiField("people_num")
	private Long peopleNum;

	/**
	 * pos业务订单外部主键信息
	 */
	@ApiField("pos_order_key")
	private PosOrderKey posOrderKey;

	/**
	 * 服务费,以元为单位,精确到分
	 */
	@ApiField("service_amount")
	private String serviceAmount;

	/**
	 * 取餐号码,示例: 桌号:04,令牌:13,取餐号
:5100,配送 :2018012912312312321( 比如饿了么订单号)
	 */
	@ApiField("take_no")
	private String takeNo;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public List<KbPosOrderDishDetail> getDishDetails() {
		return this.dishDetails;
	}
	public void setDishDetails(List<KbPosOrderDishDetail> dishDetails) {
		this.dishDetails = dishDetails;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOtherAmount() {
		return this.otherAmount;
	}
	public void setOtherAmount(String otherAmount) {
		this.otherAmount = otherAmount;
	}

	public String getPackingAmount() {
		return this.packingAmount;
	}
	public void setPackingAmount(String packingAmount) {
		this.packingAmount = packingAmount;
	}

	public Long getPeopleNum() {
		return this.peopleNum;
	}
	public void setPeopleNum(Long peopleNum) {
		this.peopleNum = peopleNum;
	}

	public PosOrderKey getPosOrderKey() {
		return this.posOrderKey;
	}
	public void setPosOrderKey(PosOrderKey posOrderKey) {
		this.posOrderKey = posOrderKey;
	}

	public String getServiceAmount() {
		return this.serviceAmount;
	}
	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getTakeNo() {
		return this.takeNo;
	}
	public void setTakeNo(String takeNo) {
		this.takeNo = takeNo;
	}

}
