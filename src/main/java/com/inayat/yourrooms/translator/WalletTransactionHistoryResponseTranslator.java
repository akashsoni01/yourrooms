package com.inayat.yourrooms.translator;

import java.util.ArrayList;
import java.util.List;

import com.inayat.yourrooms.dto.WalletTransactionHistoryResponse;
import com.inayat.yourrooms.entity.WalletTransaction;

public class WalletTransactionHistoryResponseTranslator {
	
	public static  List<WalletTransactionHistoryResponse> translate(List<WalletTransaction> trs) {
		List<WalletTransactionHistoryResponse> list = new ArrayList<>();
		for(WalletTransaction wt:trs) {
			WalletTransactionHistoryResponse resp = new WalletTransactionHistoryResponse();
			resp.setAmount(wt.getAmount());
			resp.setComment(wt.getComment());
			resp.setCreate_dt(wt.getCreate_dt());
			resp.setId(wt.getId());
			resp.setReferenceID(wt.getReference_id());
			resp.setTr_type(wt.getTr_type());
			list.add(resp);
		}
		return list;
	}

}
