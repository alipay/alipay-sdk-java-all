package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生物库通用搜索
 *
 * @author auto create
 * @since 1.0, 2023-12-22 16:01:52
 */
public class AlipayOpenBiosearchBiogroupIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 5736766595337924571L;

	/**
	 * 随机数，用于排查定位每笔请求
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 比对难度值，值越大要求难度越大，也就是在生物库中搜索的拦截分数越高，0表示不做分数拦截，默认为3
	 */
	@ApiField("compare_level")
	private String compareLevel;

	/**
	 * 生物数据，要求为jpg/jpeg格式，需要进行apache base64转化，数据需要小于1M，如果为人像时需要正立、清晰
	 */
	@ApiField("content")
	private String content;

	/**
	 * 生物库ID，由字母、数字、下划线组成，无中文和特殊字符
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 应用在哪个业务场景，默认为通用场景
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 最大返回结果数，默认最多返回1个
	 */
	@ApiField("top_n")
	private Long topN;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCompareLevel() {
		return this.compareLevel;
	}
	public void setCompareLevel(String compareLevel) {
		this.compareLevel = compareLevel;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public Long getTopN() {
		return this.topN;
	}
	public void setTopN(Long topN) {
		this.topN = topN;
	}

}
