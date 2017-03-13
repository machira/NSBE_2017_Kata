import unittest
import updown


class updown_tests(unittest.TestCase):
    def test_one_paren(self):
        self.assertEqual(1, updown.count("("))

    def test_invalid_input(self):
        self.assertRaises(ValueError, updown.count, "not_a_parenthesis")
        self.assertRaises(ValueError, updown.count, 1)
        self.assertRaises(ValueError, updown.count, "!!!")
        self.assertRaises(ValueError, updown.count, "(!)")
        self.assertRaises(ValueError, updown.count, "(000)")

    def should_return_0_for_blank_string(self):
        self.assertEqual(0, updown.count(""))

    def should_return_1_for_single_up_paren(self):
        self.assertEqual(1, updown.count('('))

    def should_return_0_for_up_then_down(self):
        self.assertEqual(0, updown.count('()'))

    def should_return_negative_results(self):
        self.assertEqual(-1, updown.count(')'))

    def should_return_1_for_up_down_then_up(self):
        self.assertEqual(1, updown.count('()('))

    def should_return_3_for_up_up_up(self):
        self.assertEqual(1, updown.count('((('))
