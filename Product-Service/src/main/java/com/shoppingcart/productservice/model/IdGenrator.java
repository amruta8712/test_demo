package com.shoppingcart.productservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Id")
public class IdGenrator {
	
	   @Id
	    private String _id;
	    private int seq;
	    
	    public IdGenrator() {	
	    }

	

		public IdGenrator(String _id, int seq) {
			super();
			this._id = _id;
			this.seq = seq;
		}



		public String get_id() {
			return _id;
		}



		public void set_id(String _id) {
			this._id = _id;
		}



		public int getSeq() {
			return seq;
		}



		public void setSeq(int seq) {
			this.seq = seq;
		}



		@Override
		public String toString() {
			return "IdGenrator [_id=" + _id + ", seq=" + seq + "]";
		}
	    
	    
	    


}
