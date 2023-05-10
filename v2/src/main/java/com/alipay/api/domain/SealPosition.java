package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签章位置描述信息
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:24:35
 */
public class SealPosition extends AlipayObject {

	private static final long serialVersionUID = 3232911116746929814L;

	/**
	 * 关键字
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 加盖签章页号
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 类型
1 : 基于关键字定位
2 : 基于相对位置定位
3 : 默认签名区
4 : 齐缝章
	 */
	@ApiField("type")
	private Long type;

	/**
	 * 相对于某一页的X轴偏移
	 */
	@ApiField("x")
	private Long x;

	/**
	 * 相对于某一页的y轴偏移
	 */
	@ApiField("y")
	private Long y;

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getType() {
		return this.type;
	}
	public void setType(Long type) {
		this.type = type;
	}

	public Long getX() {
		return this.x;
	}
	public void setX(Long x) {
		this.x = x;
	}

	public Long getY() {
		return this.y;
	}
	public void setY(Long y) {
		this.y = y;
	}

}
