package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意素材信息
 *
 * @author auto create
 * @since 1.0, 2025-05-06 19:36:35
 */
public class CreativeMaterial extends AlipayObject {

	private static final long serialVersionUID = 4557894748676548914L;

	/**
	 * 素材业务类型
根据前置API接口创意模版定义进行填充
	 */
	@ApiField("key")
	private String key;

	/**
	 * 素材文件类型
IMG:图片
VIDEO:视频
TITLE:标题/副标题
DESC:描述
来区分文案和素材库Id
	 */
	@ApiField("type")
	private String type;

	/**
	 * 图片或者视频的url
	 */
	@ApiField("url")
	private String url;

	/**
	 * 图片/视频采用素材库ID
如果是文案描述类则传入文案值即可
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
