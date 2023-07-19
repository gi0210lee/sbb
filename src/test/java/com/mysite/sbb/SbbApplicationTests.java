package com.mysite.sbb;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

//    @Autowired
//    private QuestionRepository questionRepository;
//
//    @Autowired
//    private QuestionService questionService;
//
//    @Test
//    void contextLoads() {
//    }
//
//    @Test
//    void TestInsertJpa() {
//        Question q1 = new Question();
//        q1.setSubject("sbb 가 무엇인가요");
//        q1.setContent("sbb 에 대해 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//
//        Question q2 = new Question();
//        q2.setSubject("스프링 부트 모델 질문 입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);
//    }
//
//    @Test
//    void TestSelectJpa() {
//        List<Question> all = this.questionRepository.findAll();
//        Assertions.assertEquals(2, all.size());
//
//        Question q = all.get(0);
//        Assertions.assertEquals("sbb 가 무엇인가요", q.getSubject());
//    }
//
//    @Test
//    void TestSelectJpa2() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        if (oq.isPresent()) {
//            Question q = oq.get();
//            Assertions.assertEquals("sbb 가 무엇인가요?", q.getSubject());
//        }
//    }
//
//    @Test
//    void TestSelectJpa3() {
//        Optional<Question> q = this.questionRepository.findBySubject("sbb 가 무엇인가요");
//        Assertions.assertEquals(26, q.get().getId());
//    }
//
//    @Test
//    void TestSelectJpa4() {
//        Question q1 = new Question();
//        q1.setSubject("sbb 가 무엇인가요");
//        q1.setContent("sbb 에 대해 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//        Integer savedId = q1.getId();
//
//        Optional<Question> q = this.questionRepository.findBySubject("sbb 가 무엇인가요");
//        Assertions.assertEquals(savedId, q.get().getId());
//    }
//
//    @Test
//    void testJpa() {
//        for (int i = 1; i <= 300; i++) {
//            String subject = String.format("테스트 데이터입니다.:[%03d]", i);
//            String content = "내용무";
//            this.questionService.create(subject, content, null);
//        }
//    }
}
