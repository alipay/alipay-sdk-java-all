package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云文本内容风险同步识别接口服务
 *
 * @author auto create
 * @since 1.0, 2024-03-29 11:36:22
 */
public class AlipayCloudTraasContentTextDetectModel extends AlipayObject {

	private static final long serialVersionUID = 8415934172324165671L;

	/**
	 * 用户发表内容，建议对内容中的格式符号、表情符、HTML标签、UBB标签等做过滤，只传递纯文本，以减少误判。此字段和text_type相关，短文本（short）：短文本发表内容长度范围：[1,200] 长文本（long）：长文本发表内容长度范围：[1,10000]
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 唯一请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 文本类型
注：当前版本只支持短文本检测
	 */
	@ApiField("text_type")
	private String textType;

	/**
	 * 用于输入用户支付宝的 2088 账号，如不了解此字段如何获取，可了解下静默授权。如参数无法提供，请填写“null”字符串
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTextType() {
		return this.textType;
	}
	public void setTextType(String textType) {
		this.textType = textType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
