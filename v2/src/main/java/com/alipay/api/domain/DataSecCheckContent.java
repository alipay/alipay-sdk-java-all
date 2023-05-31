package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑数据安全内容校验主体信息
 *
 * @author auto create
 * @since 1.0, 2018-06-20 11:16:30
 */
public class DataSecCheckContent extends AlipayObject {

	private static final long serialVersionUID = 4271898569453986752L;

	/**
	 * 文本或图片对应的请求唯一值，用于标识文本或图片内容
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 数据来源类型:TEXT--文本，IMAGE--图片
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 待校验的文本数据(如果包含富文本，请一起传入)
	 */
	@ApiField("text")
	private String text;

	/**
	 * 待校验图片对应地址
	 */
	@ApiListField("urls")
	@ApiField("string")
	private List<String> urls;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getText() {
		return this.text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public List<String> getUrls() {
		return this.urls;
	}
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

}
