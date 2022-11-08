package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 版本基础库查询结果vo
 *
 * @author auto create
 * @since 1.0, 2022-07-14 11:40:58
 */
public class AppxVersionConfigVo extends AlipayObject {

	private static final long serialVersionUID = 8758263666329249888L;

	/**
	 * id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 对应的占比
	 */
	@ApiField("proportion")
	private String proportion;

	/**
	 * 版本号
	 */
	@ApiField("ver")
	private String ver;

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getProportion() {
		return this.proportion;
	}
	public void setProportion(String proportion) {
		this.proportion = proportion;
	}

	public String getVer() {
		return this.ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

}
