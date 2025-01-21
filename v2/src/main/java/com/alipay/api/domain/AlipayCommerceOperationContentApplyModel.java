package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业场景运营权益申请
 *
 * @author auto create
 * @since 1.0, 2022-11-16 11:13:49
 */
public class AlipayCommerceOperationContentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8126744434562588149L;

	/**
	 * 展台
	 */
	@ApiField("booth")
	private String booth;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市编码
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 活动 id 加密串
	 */
	@ApiField("content_id_str")
	private String contentIdStr;

	/**
	 * 扩展参数 , json 串 , 可选的 key 列表 : 

prize_id : 奖品 id , ( 指定奖品返奖场景 )
	 */
	@ApiField("ext_params")
	private String extParams;

	/**
	 * 蚂蚁统一open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号，只由可由字母、数字、下划线组成。同一个活动中不可重复，相同的外部业务号会被幂等并返回之前的结果。不填时，系统会生成一个默认固定的外部业务号。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 运营场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 展台
	 */
	@ApiField("touch_point")
	private String touchPoint;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBooth() {
		return this.booth;
	}
	public void setBooth(String booth) {
		this.booth = booth;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContentIdStr() {
		return this.contentIdStr;
	}
	public void setContentIdStr(String contentIdStr) {
		this.contentIdStr = contentIdStr;
	}

	public String getExtParams() {
		return this.extParams;
	}
	public void setExtParams(String extParams) {
		this.extParams = extParams;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getTouchPoint() {
		return this.touchPoint;
	}
	public void setTouchPoint(String touchPoint) {
		this.touchPoint = touchPoint;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
