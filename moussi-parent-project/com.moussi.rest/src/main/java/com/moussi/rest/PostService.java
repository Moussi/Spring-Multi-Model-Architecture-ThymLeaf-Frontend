package com.moussi.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.moussi.dal.repositories.PostRepository;
import com.moussi.dom.Post;

@Component
@Path("/json/metallica")
public class PostService {
	
	@Autowired
	PostRepository repository;
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Post getTrackInJSON() {

		Post post = new Post();
		post =repository.findPostByName("first member");
		
		return post;
}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Post track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}
