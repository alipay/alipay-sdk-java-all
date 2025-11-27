package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单详情
 *
 * @author auto create
 * @since 1.0, 2025-09-19 18:00:49
 */
public class BookOrderDetailVO extends AlipayObject {

	private static final long serialVersionUID = 3882228678528194264L;

	/**
	 * 预约信息
	 */
	@ApiListField("book_infos")
	@ApiField("book_info_v_o")
	private List<BookInfoVO> bookInfos;

	/**
	 * 预约单
	 */
	@ApiField("book_order")
	private BookOrderVO bookOrder;

	public List<BookInfoVO> getBookInfos() {
		return this.bookInfos;
	}
	public void setBookInfos(List<BookInfoVO> bookInfos) {
		this.bookInfos = bookInfos;
	}

	public BookOrderVO getBookOrder() {
		return this.bookOrder;
	}
	public void setBookOrder(BookOrderVO bookOrder) {
		this.bookOrder = bookOrder;
	}

}
