package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 上传投放消息
 *
 * @author auto create
 * @since 1.0, 2016-09-21 11:31:27
 */
public class AlipayEcoCmsCdataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8369789671111416699L;

	/**
	 * 属性-消息投放的单个行业页面(如教育的某个幼儿园)
	 */
	@ApiField("attribute")
	private String attribute;

	/**
	 * 类目-消息投放的行业平台（教育、车主、医疗等）
	 */
	@ApiField("category")
	private String category;

	/**
	 * 消息失效时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("exp_time")
	private Date expTime;

	/**
	 * 商户消息唯一流水,类目范围内唯一,标识此消息唯一ID,若重复上传通过此判断
	 */
	@ApiField("merch_id")
	private String merchId;

	/**
	 * 操作数据,自定义,使用方需知晓

若需要同步域内时:
如果只需要支付宝这边利用数据直接完成某个功能（通知），则使用此参数传输数据.，根据不同的scene_code,op_code,channel,version共同确定参数是否可以为空，接入时由支付宝确定参数格式。
	 */
	@ApiField("op_data")
	private String opData;

	/**
	 * 消息数据,json格式,内容由模板参数列表定义.
{"占位符":"参数值","占位符2":"参数值"…}

若需要同步域内时:
场景的数据表示. json 数组
格式，根据不同的scene_code,
op_code,channel,version共同确定
参数是否可以为空，接入时由支付宝确定
参数格式。
	 */
	@ApiField("scene_data")
	private String sceneData;

	/**
	 * 消息生效时间,标准时间格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 是否需要同步域内,设定模板时需支持;
若需要特殊可选均是必填
	 */
	@ApiField("syn")
	private Boolean syn;

	/**
	 * 消息模板的版本,由开放生态分配
	 */
	@ApiField("t_v")
	private String tV;

	/**
	 * 消息模板ID,需要预先设定模板才能进行消息投放,由开放生态协商分配
	 */
	@ApiField("tamplate_id")
	private Long tamplateId;

	/**
	 * 投放目标对象,自定义.

若需要同步到域内:
场景覆盖的目标人群标识，单个用户是支付宝的userId,多个用户userId 使用英文半角逗号隔开,最多200个如果是群组,使用支付宝分配的群组ID.
	 */
	@ApiField("target_id")
	private String targetId;

	public String getAttribute() {
		return this.attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public Date getExpTime() {
		return this.expTime;
	}
	public void setExpTime(Date expTime) {
		this.expTime = expTime;
	}

	public String getMerchId() {
		return this.merchId;
	}
	public void setMerchId(String merchId) {
		this.merchId = merchId;
	}

	public String getOpData() {
		return this.opData;
	}
	public void setOpData(String opData) {
		this.opData = opData;
	}

	public String getSceneData() {
		return this.sceneData;
	}
	public void setSceneData(String sceneData) {
		this.sceneData = sceneData;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Boolean getSyn() {
		return this.syn;
	}
	public void setSyn(Boolean syn) {
		this.syn = syn;
	}

	public String gettV() {
		return this.tV;
	}
	public void settV(String tV) {
		this.tV = tV;
	}

	public Long getTamplateId() {
		return this.tamplateId;
	}
	public void setTamplateId(Long tamplateId) {
		this.tamplateId = tamplateId;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

}
