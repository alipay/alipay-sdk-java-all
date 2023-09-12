package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 视觉资源元数据
 *
 * @author auto create
 * @since 1.0, 2023-07-17 15:11:31
 */
public class GiftTemplateMetaInfo extends AlipayObject {

	private static final long serialVersionUID = 3216227481584656464L;

	/**
	 * 视觉资源链接，使用于红包详情页
	 */
	@ApiField("link")
	private String link;

	/**
	 * 展示文案
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 视觉资源所属类型，值为image时表示图片，值为video时表示视频
	 */
	@ApiField("type")
	private String type;

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
